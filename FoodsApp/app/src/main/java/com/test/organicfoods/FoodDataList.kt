package com.test.organicfoods

/***
 * Stores the food data.
 * You can also the change the food values here
 */


class FoodDataList {

    companion object{

        fun getFruits():MutableList<FoodType.Fruit>{
            /***
             * Descriptions and pictures of the fruits here are not mine !
             * Credit to the sources:
             * Description - https://www.berries.com/blog/types-of-fruit
             * Images = https://unsplash.com/
             */

            return mutableListOf(
                FoodType.Fruit("Apple",R.drawable.apple,"Apples come in hundreds of color and flavor varieties. This versatile fruit can be enjoyed as a snack, mashed into sauce or even cooked into desserts. Even though the old adage “an apple a day keeps the doctor away” is not a scientific fact, these fleshy fruits have plenty of health benefits."),
                FoodType.Fruit("Avocado",R.drawable.avocado,"Avocados have swept the nation in recent years. These nutrient dense fruits can be consumed by themselves, smashed into guacamole or even used in chocolate desserts. It’s easy to see why people love them — avocados are packed with nutrients!"),
                FoodType.Fruit("Banana",R.drawable.banana,"The banana is one of the most popular fruits in the world despite the limited climates that it can grow in. These sweet tropical fruits are often used in desserts, blended into smoothies and enjoyed alone."),
                FoodType.Fruit("Blackberry",R.drawable.black_berry,"These small dark druplets are enjoyed alone, in desserts or in compotes placed atop steaks or other red meats. Blackberries grow all over the world in the wild so next time you are on a hike, look out for these tasty snacks!"),
                FoodType.Fruit("Pear",R.drawable.pear,"This sweet and crunchy snack comes in a variety of colors and shapes. Pears can be enjoyed fresh, cooked in cinnamon or baked into desserts. Though not particularly high in any specific nutrient, the pear boasts a range of micronutrients."),
                FoodType.Fruit("Pineapple",R.drawable.pineapple,"The pineapple is covered in a thick, spiky skin. Inside the tough exterior, there is sweet, yellow fruit. This tropical treat is often grilled on skewers with meat and other types of fruit, enjoyed alone and added to desserts."),
                FoodType.Fruit("Plum",R.drawable.plum,"This sweet fruit has a dark purple skin that encases juicy insides that can range from yellow to red in color. Plums are quite bitter before they are ripe. To ensure you buy a ripe fruit, make sure to choose one that is heavy, slightly soft and has a sweet scent. This little fruit can be enjoyed fresh or in its dried form, known as a prune."),
                FoodType.Fruit("Pomegranate",R.drawable.pomegranate,"Pomegranates are made up of a thick red skin and hundreds of red seeds inside. These bright red treats are used in desserts, juices and as garnishes."),
                FoodType.Fruit("Watermelon",R.drawable.watermelon,"A watermelon, as the name suggests, has an extremely high water content. This sweet fruit has a green rind and is filled with juicy red fruit. This low-calorie snack will keep you hydrated and happy on even the hottest day.")
            )
        }





        fun getVegetables():MutableList<FoodType.Vegetable>{
            /***
             * Descriptions and pictures of the fruits here are not mine !
             * Credit to the sources:
             * Description - https://www.nutritionadvance.com/healthy-foods/types-of-vegetables/
             * Images = https://unsplash.com/
             */
            return mutableListOf(
                FoodType.Vegetable("Asparagus",R.drawable.asparagus,"Out of all the different vegetables in the world, asparagus has a good argument for being the tastiest. After all, it’s often the one which steakhouses serve alongside the main attraction."),
                FoodType.Vegetable("Bell Peppers",R.drawable.bell_pepper,"Bell peppers come in all shapes and sizes, but they all grow from the same plant. The difference between green, yellow, orange and red varieties is merely the state of ripeness. Red bell peppers are the ripest and sweetest, while green peppers are the freshest and slightly bitter."),
                FoodType.Vegetable("Beet Greens",R.drawable.beet_greens,"The leaves of the beetroot plant are incredibly nutritious, so don’t throw them away!"),
                FoodType.Vegetable("Beets",R.drawable.beet,"Depending on where you are from, beets (or beetroot) goes by different names. Beets are a root vegetable, and they are quite adaptable too. For instance, they can be boiled, fried, roasted, mashed, or you can even buy pickled beets."),
                FoodType.Vegetable("Broccoli",R.drawable.broccoli,"A lesser-known vegetable is broccoli rabe (also called ‘rapini’). Despite containing the broccoli name and belonging to the same family of plants, they are two separate vegetables. Rapini has a strong, flavorful but slightly bitter taste, and it’s commonly found in the Mediterranean region’s cuisine."),
                FoodType.Vegetable("Cabbage",R.drawable.cabbage,"Cabbage is a large-headed green vegetable that has close botanical links to broccoli, cauliflower, and brussels sprouts. Cabbage belongs to the cruciferous category of vegetables and like others, it has links to similar anti-cancer health benefits."),
                FoodType.Vegetable("Carrot",R.drawable.carrot,"Carrots grow underground, and they are mainly known for their high vitamin A (in the form of beta-carotene) content. That said, it’s essential to eat them with a source of fat if you want to absorb this (fat-soluble) vitamin."),
                FoodType.Vegetable("Cauliflower",R.drawable.cauliflower,"You can find all sorts of cauliflower products, ranging from cauliflower rice to mashed cauliflower. For home-baking enthusiasts, cauliflower pizza is even a thing. In my opinion, though, cauliflower cheese will always be the best."),
                FoodType.Vegetable("Potatoes",R.drawable.potato,"While a traditional staple food in the East is rice, potatoes fill that bracket for much of the West. Interestingly, there are many different types of potatoes, each of which have their own unique characteristics. Nutritionally, potatoes are one of the higher carbohydrate sources on this list of vegetables."),
                FoodType.Vegetable("Spinach",R.drawable.spinach,"Spinach is among the most nutrient-dense of this list of vegetables. It is a leafy green that is native to Asia, and it is incredibly high in vitamin A (as beta-carotene) and vitamins C and K1.")
            )
        }





    }


}