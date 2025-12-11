class MyResponsiveTable extends HTMLElement {
  constructor() {
    super();
    
    // attach shadow DOM
    const shadowRoot = this.attachShadow({ mode: 'open' });
  }

  connectedCallback() {

  }

  disconnectedCallback() {

  }
}

customElements.define('my-responsive-table', MyResponsiveTable);