package org.d3ifcool1023.praassesment


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3ifcool1023.praassesment.databinding.FragmentPraAssesmentBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PraAssesment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val binding: FragmentPraAssesmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_pra_assesment, container, false)
      binding.PersegiPanjangBtn.setOnClickListener { v: View ->
         v.findNavController().navigate(R.id.action_praAssesment_to_persegiPanjang)

    }
        binding.SegitigaBtn.setOnClickListener { v: View ->
            v.findNavController().navigate(R.id.action_praAssesment_to_segitigaSiku)

        }



        setHasOptionsMenu(true)
        return binding.root
//     return inflater.inflate(R.layout.fragment_pra_assesment, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu,menu)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return NavigationUI.onNavDestinationSelected(item,view!!.findNavController()) || super.onContextItemSelected(item)
    }

}
