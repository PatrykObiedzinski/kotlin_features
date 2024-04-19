package basic

class CompanionObject {

    companion object Friend {
        fun fromFriend() {
            println("fromFriend() from Friend")
        }
    }

//    companion object Friend2 {
//        fun fromFriend() {
//            println("Friend object from Friend")
//        }
//    }
}

class NoCompanionObject {
    object NoFriend {
        fun fromNotAFriend() {
            println("fromNotAFriend from NoFriend")
        }
    }

    object NoFriend2 {
        fun fromNotAFriend() {
            println("fromNotAFriend from NoFriend2")
        }
    }
}

fun companionObject() { // it actually creates static functions
    CompanionObject.fromFriend()
    NoCompanionObject.NoFriend.fromNotAFriend()
    NoCompanionObject.NoFriend2.fromNotAFriend()
}

