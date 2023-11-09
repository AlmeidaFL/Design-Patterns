package creational.builder

class HouseBuilder {
    val house = House()

    fun withTV(TV: String) {
        house.tv = TV
    }

    fun withFreezer(freezer: String) {
        house.freezer = freezer
    }

    fun withBedRoom(bedRoom: String) {
        house.bedroom = bedRoom
    }

    fun withWardRobe(wardrobe: String) {
        house.wardrobe = wardrobe
    }
}