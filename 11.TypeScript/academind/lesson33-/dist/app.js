"use strict";
const button = document.querySelector('button');
function clickHandler(message) {
    console.log('Clicked!' + message);
}
if (button) {
    button.addEventListener('click', clickHandler.bind(null, 'All done!'));
}
// Q: How does typescript knows all this is available code?
// A: because of the lib property in the tsconfig.json file (if it is disabled, the default configurations follow the target's setup)
//# sourceMappingURL=app.js.map