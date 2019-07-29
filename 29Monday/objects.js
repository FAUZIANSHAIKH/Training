var dishes={
    id: 34,
    name: 'masala-dosa',
    price:40,

    getPrice:function(){
        return this.price;
    },
    getName: function(){
        return this.name;
    }
}

var fun=function(){
    console.log(this.firstname);
    console.log(this.lastname);
}
var obj={
    firstname:'Lohit',
    lastname:'kumar'
}
// fun.call(obj);
var fun=function(array=[]){
    console.log(array)
    console.log(this.firstname+" works for "+array[0]+ " location "+array[1])
}
var obj={
    firstname:'Lalit',
    lastname:'kumar'
}
var arr=[]
arr[0]='TCS'
arr[1]='Chennai'
var rebindFun=fun.bind(obj,arr);
rebindFun()
// fun.call(obj,['TCS','Chennai'])
// var ret=fun.bind(obj,['TCS','Chennai'])
// ret();

// fun();
// console.log(dishes.getPrice())
// },
// {
//     id: 35,
//     'dish-name': 'idli-vada',
//     price:45
// }
// ]
// for(var index=0;index<dishes.length;index++){
// console.log(dishes[index]['dish-name']+" "+dishes[index].price);
// }
// let printDishName=function(allDishes){
// console.log(' arguments ');
// console.log(arguments);
// for(var index=0;index<allDishes.length;index++){
//     console.log(allDishes[index]['dish-name']);
// }

// }
// printDishName(dishes);