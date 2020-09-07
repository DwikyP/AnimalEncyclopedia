package com.dp13.animalencyclopedia

object AnimalsData{
    private val animalNames = arrayOf("Brown Bear",
        "Boar",
        "Chicken",
        "Cow",
        "Saltwater Crocodile",
        "Red Deer",
        "Greylag Goose",
        "Alpine Ibex",
        "Great White Shark",
        "Tiger",
        "Wolf")

    private val scientificAnimalNames = arrayOf("Ursus arctos",
        "Sus scrofa",
        "Gallus gallus domesticus",
        "Bos taurus",
        "Crocodylus porosus",
        "Cervus elaphus",
        "Anser anser",
        "Capra ibex",
        "Carcharodon carcharias",
        "Panthera tigris",
        "Canis lupus"
    )

    private val animalClasses = arrayOf("Mammalia",
        "Mammalia",
        "Aves",
        "Mammalia",
        "Reptilia",
        "Mammalia",
        "Aves",
        "Mammalia",
        "Chondrichthyes",
        "Mammalia",
        "Mammalia"
    )

    private val animalOrders = arrayOf("Carnivora",
        "Artiodactyla",
        "Galliformes",
        "Artiodactyla",
        "Crocodilia",
        "Artiodactyla",
        "Anseriformes",
        "Artiodactyla",
        "Lamniformes",
        "Carnivora",
        "Carnivora"
    )

    private val animalFamilies = arrayOf("Ursidae",
        "Suidae",
        "Phasianidae",
        "Bovidae",
        "Crocodylidae",
        "Cervidae",
        "Anatidae",
        "Bovidae",
        "Lamnidae",
        "Felidae",
        "Canidae"
    )

    private val animalDescription = arrayOf("The brown bear (Ursus arctos) is a bear species found across Eurasia and North America. In North America, the populations of brown bears are called grizzly bears. It is one of the largest living terrestrial members of the order Carnivora, rivaled in size only by its closest relative, the polar bear (Ursus maritimus), which is much less variable in size and slightly bigger on average.",
        "The wild boar (Sus scrofa), also known as the \"wild swine\", \"common wild pig\", or simply \"wild pig\", is a suid native to much of Eurasia and North Africa, and has been introduced to the Americas and Oceania. The species is now one of the widest-ranging mammals in the world, as well as the most widespread suiform.",
        "The chicken (Gallus gallus domesticus) is a type of domesticated fowl, a subspecies of the red junglefowl (Gallus gallus). Chickens are one of the most common and widespread domestic animals, with a total population of 23.7 billion as of 2018. up from more than 19 billion in 2011.",
        "Cattle, or cows (female) and bulls (male), are the most common type of large domesticated ungulates. They are a prominent modern member of the subfamily Bovinae, are the most widespread species of the genus Bos, and are most commonly classified collectively as Bos taurus. Cattle are commonly raised as livestock for meat (beef or veal, see beef cattle), for milk (see dairy cattle), and for hides, which are used to make leather. They are used as riding animals and draft animals (oxen or bullocks, which pull carts, plows and other implements). ",
        "The saltwater crocodile (Crocodylus porosus) is a crocodilian native to saltwater habitats and brackish wetlands from India's east coast across Southeast Asia and the Sundaic region to northern Australia and Micronesia. It has been listed as Least Concern on the IUCN Red List since 1996. It was hunted for its skin throughout its range up to the 1970s, and is threatened by illegal killing and habitat loss. It is regarded as dangerous for people who share the same environment.",
        "The red deer (Cervus elaphus) is one of the largest deer species. The red deer inhabits most of Europe, the Caucasus Mountains region, Asia Minor, Iran, parts of western Asia, and central Asia. It also inhabits the Atlas Mountains region between Morocco and Tunisia in northwestern Africa, being the only species of deer to inhabit Africa. Red deer have been introduced to other areas, including Australia, New Zealand, United States, Canada, Peru, Uruguay, Chile and Argentina.",
        "The greylag goose (Anser anser) is a species of large goose in the waterfowl family Anatidae and the type species of the genus Anser. It has mottled and barred grey and white plumage and an orange beak and pink legs. A large bird, it measures between 74 and 91 centimetres (29 and 36 in) in length, with an average weight of 3.3 kilograms (7.3 lb). Its distribution is widespread, with birds from the north of its range in Europe and Asia migrating southwards to spend the winter in warmer places.",
        "The Alpine ibex (Capra ibex), also known as the steinbock, bouquetin, or simply ibex, is a species of wild goat that lives in the mountains of the European Alps. It is a sexually dimorphic species with larger males that carry larger, curved horns. Their coat colour is typically brownish grey. Alpine ibex tend to live in steep, rough terrain near the snow line. They are also social, although adult males and females segregate for most of the year, coming together only to mate.",
        "The great white shark (Carcharodon carcharias), also known as the great white, white shark or \"white pointer\", is a species of large mackerel shark which can be found in the coastal surface waters of all the major oceans. It is notable for its size, with larger female individuals growing to 6.1 m (20 ft) in length and 1,905–2,268 kg (4,200–5,000 lb) in weight at maturity. However, most are smaller; males measure 3.4 to 4.0 m (11 to 13 ft), and females measure 4.6 to 4.9 m (15 to 16 ft) on average. According to a 2014 study, the lifespan of great white sharks is estimated to be as long as 70 years or more, well above previous estimates, making it one of the longest lived cartilaginous fishes currently known.",
        "The tiger (Panthera tigris) is the largest extant cat species and a member of the genus Panthera. It is most recognisable for its dark vertical stripes on orange-brown fur with a lighter underside. It is an apex predator, primarily preying on ungulates such as deer and wild boar. It is territorial and generally a solitary but social predator, requiring large contiguous areas of habitat, which support its requirements for prey and rearing of its offspring.",
        "The wolf (Canis lupus), also known as the gray wolf or grey wolf, is a large canine native to Eurasia and North America. More than thirty subspecies of Canis lupus have been recognized, and gray wolves, as colloquially understood, comprise non-domestic/feral subspecies. The wolf is the largest extant member of Canidae, males averaging 40 kg (88 lb) and females 37 kg (82 lb). Wolves measure 105–160 cm (41–63 in) in length and 80–85 cm (31–33 in) at shoulder height. The wolf is also distinguished from other Canis species by its less pointed ears and muzzle, as well as a shorter torso and a longer tail"
    )

    private val animalImages = arrayOf(R.drawable.bear,
        R.drawable.boar,
        R.drawable.chicken,
        R.drawable.cow,
        R.drawable.crocodile,
        R.drawable.deer,
        R.drawable.goose,
        R.drawable.ibex,
        R.drawable.shark,
        R.drawable.tiger,
        R.drawable.wolf
    )

    val listData: ArrayList<Animal>
        get(){
            val list = arrayListOf<Animal>()
            for (position in animalNames.indices){
                val animal = Animal()
                animal.name = animalNames[position]
                animal.scientificName = scientificAnimalNames[position]
                animal.animalClass = animalClasses[position]
                animal.Order = animalOrders[position]
                animal.Family = animalFamilies[position]
                animal.description = animalDescription[position]
                animal.photo = animalImages[position]
                list.add(animal)
            }
            return  list
        }

}