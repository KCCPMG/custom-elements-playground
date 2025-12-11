class MyButton extends HTMLButtonElement {
  constructor() {
    super();
  }

  connectedCallback() {
    console.log("I exist");
    this.addEventListener('click', this.handleClick);
  }

  disconnectedCallback() { 
    console.log("Goodbye");
    this.removeEventListener('click', this.handleClick);
  }

  handleClick = (() => {
    console.log(this, " clicked");
  })
}

customElements.define('my-button', MyButton, {extends: "button"});