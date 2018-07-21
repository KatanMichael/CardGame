package adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import classes.Card
import com.katan.sapirmichael.cardgame.R



class CardsAdapter (val items: Array<Card>, val context: Context) : RecyclerView.Adapter<CardsAdapter.ViewHolder>()
{


    override fun getItemCount(): Int
    {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        return LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false) as ViewHolder
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)
    {
        val imageView : ImageView =  view.findViewById(R.id.card_imageView)

    }



}

