package com.test.organicfoods

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FoodListFragment<FOODTYPE>(
    layoutId:Int,
    private val foods:MutableList<FOODTYPE>):Fragment(layoutId) {



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (view as RecyclerView).apply {
            layoutManager = GridLayoutManager(context,2,GridLayoutManager.VERTICAL,false)
            addItemDecoration(FoodItemDecoration())
            adapter = CustomRecyclerAdapter(foods, requireContext())
        }
    }




    private class CustomRecyclerAdapter<FOODTYPE>(
        val foods:MutableList<FOODTYPE>,
        val context: Context
    ): RecyclerView.Adapter<CustomRecyclerAdapter.CustomViewHolder>(){

        class CustomViewHolder(val v: View): RecyclerView.ViewHolder(v){
            val foodImage = v.findViewById<ImageView>(R.id.foodImage)
            val foodText = v.findViewById<TextView>(R.id.foodName)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
            return CustomViewHolder(
                LayoutInflater.from(context).inflate(R.layout.food_individual_list_box,parent,false)
            )
        }

        override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
            val startActivity = {foodName:String , foodDescription:String , foodImage:Int ->
                val intent = Intent(context,FullFoodDetailsActivity::class.java).apply {
                    putExtra("name",foodName)
                    putExtra("description",foodDescription)
                    putExtra("imageResource",foodImage)
                }

                context.startActivity(intent)
            }

            val food = foods[position]

            if (food is FoodType.Vegetable){
                holder.foodImage.setImageDrawable(AppCompatResources.getDrawable(context,food.imageRes))
                holder.foodText.text = food.name
                holder.v.setOnClickListener{
                    startActivity(food.name,food.desc,food.imageRes)
                    (context as Activity).overridePendingTransition(R.anim.slide_in,R.anim.always_visible)
                }
            }

            else if (food is FoodType.Fruit){
                holder.foodImage.setImageDrawable(AppCompatResources.getDrawable(context,food.imageRes))
                holder.foodText.text = food.name
                holder.v.setOnClickListener{
                    startActivity(food.name,food.desc,food.imageRes)
                    (context as Activity).overridePendingTransition(R.anim.slide_in,R.anim.always_visible)
                }
            }


        }

        override fun getItemCount(): Int = foods.size
    }



    private class FoodItemDecoration:RecyclerView.ItemDecoration(){
        override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
        ) {
            super.getItemOffsets(outRect, view, parent, state)

            if (parent.getChildAdapterPosition(view)%2 == 0) outRect.right = 20
            else outRect.right = 0

            outRect.bottom = 30

        }
    }

}