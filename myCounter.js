class MyCounter extends HTMLElement {
  constructor() {
    super();

    this.value = 0;
    
    // attach shadow DOM
    const shadowRoot = this.attachShadow({ mode: 'open' });

    this.displaySpan = document.createElement('span');
    this.incrementButton = document.createElement('button');
    this.incrementButton.textContent = "( + )";
    this.incrementButton.addEventListener('click', () => this.increment() );
    
    this.decrementButton = document.createElement('button');
    this.decrementButton.addEventListener('click', () => this.decrement() );
    this.decrementButton.textContent = "( - )";

    this.shadowRoot.append(this.displaySpan, this.incrementButton, this.decrementButton);

    // this.increment.bind(this);
    // this.decrement.bind(this);
    // this.render.bind(this);
  }

  increment() {
    this.value++;
    this.render();
  }

  decrement() {
    this.value--;
    this.render();
  }

  connectedCallback() {
    console.log("myCounter connected");
    this.render();
  }

  disconnectedCallback() {

  }

  

  render() {

    this.displaySpan.textContent = this.value;
    // const superIncrement = this.increment;
    // const superDecrement = this.decrement;

    // this.shadowRoot.cl
    // this.displaySpan = document.createElement('span');
    // this.incrementButton = document.createElement('button');
    // this.incrementButton.textContent = "( + )";
    // this.incrementButton.addEventListener('click', () => { superIncrement() });
    
    // this.decrementButton = document.createElement('button');
    // this.decrementButton.addEventListener('click', superDecrement);
    // this.decrementButton.textContent = "( - )";

    // this.shadowRoot.append(this.displaySpan, this.incrementButton, this.decrementButton);
  }
}

customElements.define('my-counter', MyCounter);


