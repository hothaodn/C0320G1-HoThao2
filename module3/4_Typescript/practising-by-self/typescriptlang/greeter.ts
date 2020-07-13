function sayHello(name : string) {
    return "Hello " + name;
}

let nameToHello : string = "Kitty";
// let nameToHello : number = 9;


document.getElementById("display").innerHTML = sayHello(nameToHello);
document.body.textContent = sayHello(nameToHello);