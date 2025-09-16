class EventEmitter {
    constructor() {
        this.events = {}; // stores eventName -> list of callbacks
    }

    subscribe(event, cb) {
        if (!this.events[event]) {
            this.events[event] = [];
        }

        this.events[event].push(cb);

        return {
            unsubscribe: () => {
                this.events[event] = this.events[event].filter(fn => fn !== cb);
                return undefined;
            }
        };
    }

    emit(event, args = []) {
        if (!this.events[event]) return [];
        return this.events[event].map(cb => cb(...args));
    }
}
