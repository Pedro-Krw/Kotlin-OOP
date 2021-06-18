package `Getter&Setter`

class GetterSetter (val name : String) {

   var title : String = name
    get(){

        return field
    }
    set(value) {
        if (value.isNotBlank()){
            field = value
        }
    }


}