var exec = cordova.require("cordova/exec");

var testInProgress = false;

function OTAKeys() {

  OTAKeys.prototype.test = function (successCallback, errorCallback) {

  

    if (errorCallback == null) {
        errorCallback = function () {
        };
    }

    if (typeof errorCallback != "function") {
        console.log("OTAKeys.test failure: failure parameter not a function");
        return;
    }

    if (typeof successCallback != "function") {
        console.log("OTAKeys.test failure: success callback parameter must be a function");
        return;
    }

    if (testInProgress) {
        errorCallback('Test is already in progress');
        return;
    }

    testInProgress = true;

    exec(
        function(result) {
          testInProgress = false;
            // work around bug in ZXing library
            successCallback(result);
        },
        function(error) {
          testInProgress = false;
            errorCallback(error);
        },
        'Otakeys',
        'test'
    );
  };

};

var otaKeys = new OTAKeys();
module.exports = otaKeys;