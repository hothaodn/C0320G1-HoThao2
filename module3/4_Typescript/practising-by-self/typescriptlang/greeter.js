function sayHello(name) {
    return "Hello " + name;
}
var nameToHello = "Kitty";
// let nameToHello : number = 9;

document.getElementById("display").innerHTML = sayHello(nameToHello);
// document.body.textContent = sayHello(nameToHello);
