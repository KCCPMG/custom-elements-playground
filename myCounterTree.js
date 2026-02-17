class MyCounterTree extends HTMLElement {
  constructor() {
    super();
    const countObj = {count: 0};
    const countProxy = new Proxy()
  }

  increment() {
    this.value++;
    this.render();
  }

  decrement() {
    this.value--;
    this.render();
  }
}

class DecrementButton extends HTMLElement {
  constructor() {
    super();
  }
}

class IncrementButton extends HTMLElement {
  constructor() {
    super();
  }
}


customElements.define('decrement-button', DecrementButton);
customElements.define('increment-button', IncrementButton);
customElements.define('my-counter-tree', MyCounterTree);