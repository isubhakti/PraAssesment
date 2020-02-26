package org.d3ifcool1023.praassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import kotlinx.android.synthetic.main.fragment_segitiga_siku.*
import org.d3ifcool1023.praassesment.databinding.FragmentPersegiPanjangBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiPanjang : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentPersegiPanjangBinding>(
            inflater, R.layout.fragment_persegi_panjang, container, false)

        binding.HitungNilaiPersegi.setOnClickListener {
            var panjang = binding.PanjangPersegi.text.toString().toInt()
            var lebar = binding.LebarPersegi.text.toString().toInt()
            var luas = panjang*lebar
            var keliling = 2 *(panjang + lebar)

            binding.NilaiKelilingPersegi.text = keliling.toString()

            binding.NilaiLuasPersegi.text = luas.toString()


        }
        return binding.root
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        outState.putInt("luas",)
//        super.onSaveInstanceState(outState)
//    }


}
