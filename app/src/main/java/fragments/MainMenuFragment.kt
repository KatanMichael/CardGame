package fragments

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

import com.katan.sapirmichael.cardgame.R
import androidx.fragment.app.Fragment
import com.katan.sapirmichael.cardgame.R.id.main_inst_btn

class MainMenuFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View

        view = inflater.inflate(R.layout.mainmenu, null, false)

        val main_inst_btn: Button = view.findViewById(R.id.main_inst_btn)

        val main_start_btn: Button = view.findViewById(R.id.main_start_btn)

        main_inst_btn.setOnClickListener()
        {
            //TODO Add Instruction Fragment
            Toast.makeText(context,"מסך הוראות",Toast.LENGTH_SHORT).show()
        }

        main_start_btn.setOnClickListener()
        {
            Toast.makeText(context,"מסך התחלת משחק",Toast.LENGTH_SHORT).show()
        }

        return view

    }
}
