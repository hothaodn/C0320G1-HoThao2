var Customer = /** @class */ (function () {
    function Customer(firstName, lastName) {
        this.Name = firstName + "  " + lastName;
    }
    Customer.prototype.GetName = function () {
        return "Hello, " + this.Name;
    };
    return Customer;
}());
var cust = new Customer("Jimi", "Scott");
