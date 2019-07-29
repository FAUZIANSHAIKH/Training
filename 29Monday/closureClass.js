var Dish = function(){
    var id=0;
    var name='';
    var price = 110;

    var obj={
        setId:function(argId){
            id = argId;
        },
        getId:function(){
            return id;
        },
        setName : function(argName){
                name = argName;
        },
        getName : function(){
            return name;
        },
        getDesc : function(){
            return `id: ${id}+ name: ${name}+ price: ${price}`;
        }
    }
    return obj;
}()

// var result = Dish();
// result.setId(24);
// result.setName("Panner Kulcha");
// console.log(result.getDesc());

Dish.setId(23);
console.log(Dish.getId());