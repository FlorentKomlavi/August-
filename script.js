let date = new Date();

let option = {
    dateStyle: "short",
    timeStyle: "short"
};
//console.log(`Togo:${date.toLocaleTimeString('en-US', option)}`);
console.log(document.write(`Togo: ${date.toLocaleDateString('fr-TG')} ${date.toLocaleTimeString('fr-TG')}`));
 