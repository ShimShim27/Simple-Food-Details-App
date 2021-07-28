package com.test.organicfoods

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.tabs.TabLayout

class HomeScreenFragment:Fragment(R.layout.home_screen_fragment) {
    private val fruits = FoodDataList.getFruits()
    private val vegetables = FoodDataList.getVegetables()

    private val foodListsFragments = mutableMapOf(
        "fruits"  to FoodListFragment(R.layout.fruit_fragment,fruits),
        "vegetables" to FoodListFragment(R.layout.vegetable_fragment,vegetables)
    )


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initializeFoodFragments()
        initializeTabLayout()
        selectFragment(0)
    }




    private fun initializeFoodFragments(){
        fTransaction().apply {
            add(R.id.fragment_container_view,foodListsFragments["fruits"]!!)
            add(R.id.fragment_container_view,foodListsFragments["vegetables"]!!)
            commit()
        }
    }


    private fun initializeTabLayout(){




        val mainTab = requireActivity().findViewById<TabLayout>(R.id.mainTab)
        mainTab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) selectFragment(tab.position)

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })


    }



    private fun selectFragment(index:Int){

        val changeFragment = {fragment: Fragment ->
            fTransaction().apply {
                show(fragment)
                commit()
            }

            //hide other fragment
            foodListsFragments.values.filter { it != fragment }.forEach{ toBeHiddenFragment->
                fTransaction().apply {
                    hide(toBeHiddenFragment)
                    commit()
                }
            }

        }



        when(index){
            0 -> changeFragment(foodListsFragments["fruits"]!!)
            1 -> changeFragment(foodListsFragments["vegetables"]!!)
        }
    }


    private fun fTransaction(): FragmentTransaction = parentFragmentManager.beginTransaction()



}