package basics

fun main() {
    var iCanBeReassigned = "I can be reassigned";
    val iCantBeReassigned = "I Can not be reassigned";

    iCanBeReassigned = reassignVariable(iCanBeReassigned);

    println("Hi! var iCanBeReassigned: $iCanBeReassigned");
    println("Hi! var iCantBeReassigned: $iCantBeReassigned");
}

fun reassignVariable(oldMessage: String) : String {
    return "Do you see? I have been reassigned =)";
};