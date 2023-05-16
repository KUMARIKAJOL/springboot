var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Employement = /** @class */ (function () {
    function Employement(empName, empId) {
        this.empId = empId;
        this.empName = empName;
    }
    return Employement;
}());
var FullTime = /** @class */ (function (_super) {
    __extends(FullTime, _super);
    function FullTime(empName, empId, hoursWorked, pricePerHour) {
        var _this = _super.call(this, empName, empId) || this;
        _this.hoursWorked = hoursWorked;
        _this.pricePerHour = pricePerHour;
        return _this;
    }
    FullTime.prototype.salary = function () {
        var sal = this.hoursWorked * this.pricePerHour;
        console.log("Salary of : " + this.empName + " is " + sal);
    };
    return FullTime;
}(Employement));
var PartTime = /** @class */ (function (_super) {
    __extends(PartTime, _super);
    function PartTime(empName, empId, hoursWorked, pricePerHour) {
        var _this = _super.call(this, empName, empId) || this;
        _this.hoursWorked = hoursWorked;
        _this.pricePerHour = pricePerHour;
        return _this;
    }
    PartTime.prototype.salary = function () {
        var sal = this.hoursWorked * this.pricePerHour;
        console.log("Salary of : " + this.empName + " is " + sal);
    };
    return PartTime;
}(Employement));
var arun = new FullTime('Arun Kumar', 2345, 9, 1500);
arun.salary();
