package fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.GlideBuilder
import com.katan.sapirmichael.cardgame.R
import kotlinx.android.synthetic.main.mainmenu.*

class MainMenuFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.mainmenu, null, false)

        val main_inst_btn: ImageButton = view.findViewById(R.id.main_inst_btn)

        val main_start_btn: ImageButton = view.findViewById(R.id.main_start_btn)


        main_inst_btn.setOnClickListener()
        {

            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.MainFragmentsPlace, InstFrag())?.commit()
        }

        main_start_btn.setOnClickListener()
        {
            activity?.supportFragmentManager?.beginTransaction()?.add(R.id.MainFragmentsPlace, PlayFrag())?.commit()
        }

        return view

    }




    }
