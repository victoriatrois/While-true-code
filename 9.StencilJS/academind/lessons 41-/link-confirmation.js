class LinkConfirmation extends HTMLAnchorElement {
  connectedCallback() {
    this.addEventListener('click', event => {
      if (! confirm('Do you really want to leave?')) {
        event.preventDefault();
      } 
    });
  }
}

customElements.define('v3s-link-confirmation', LinkConfirmation, {extends: 'a'});