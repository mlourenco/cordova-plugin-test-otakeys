"use strict";


module.exports = {
  test: function (success, failure) {
    cordova.exec(success, failure, 'Otakeys', 'test');
  }
}
