let sum=function(a,b){
    return a+b;
}
let sub=function(a,b){
    return a-b;
}
let product=function(a,b){
    return a*b;
}
let calc=function(a,b,fun){
    return fun(a,b);
}

var concat=function(a,b){
    console.log('came inside '+b)
    return a+b;
}
console.log(calc(20,30,product))
console.log(calc("hello ","world",concat))
