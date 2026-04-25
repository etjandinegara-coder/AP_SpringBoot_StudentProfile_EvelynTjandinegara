const hour = new Date().getHours();
let greeting = "Hello";

if (hour < 12) {
    greeting = "Good Morning";
} else if (hour < 18) {
    greeting = "Good Afternoon";
} else {
    greeting = "Good Night";
}

const el = document.getElementById("greeting");
if (el) {
    el.innerText = greeting;
}