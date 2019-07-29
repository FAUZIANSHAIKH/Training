var returnFunction=function(firstName, lastName){
    var greetFun=function(message){
        console.log(message+firstName+ ' '+lastName)
    }
    return greetFun;
}
var result=returnFunction('Vinay','Kumar');
// console.log(result());
result("Welcome !!")
result("Good Morning !!")