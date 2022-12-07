"use strict";
let logged; //I can omit types in variables, TS can track it along the code and imply which type it holds.
function sendAnalytics(data) {
    console.log(data);
    logged = true;
}
sendAnalytics('The Data');
//# sourceMappingURL=analytics.js.map