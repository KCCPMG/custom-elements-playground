class MyResponsiveTable extends HTMLElement {
  constructor() {
    super();
    const shadowRoot = this.attachShadow({ mode: 'open' });
  }

  connectedCallback() {

  }

  disconnectedCallback() {
    
  }
}

customElements.define('my-responsive-table', MyResponsiveTable);