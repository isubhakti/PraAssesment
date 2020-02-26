package org.d3ifcool1023.praassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_segitiga_siku.*
import org.d3ifcool1023.praassesment.databinding.FragmentPersegiPanjangBinding
import org.d3ifcool1023.praassesment.databinding.FragmentSegitigaSikuBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaSiku : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSegitigaSikuBinding>(
            inflater, R.layout.fragment_segitiga_siku, container, false
        )
        binding.HitungNilaiSegitiga.setOnClickListener {
            var alas = binding.AlasSegitiga.text.toString().toDouble()
            var tinggi = binding.TinggiSegitiga.text.toString().toDouble()
            var sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi))
            var luas = alas * tinggi / 2
            var keliling = alas + tinggi + sisiMiring

            NilaiKelilingSegitiga.text = keliling.toString()

            NilaiLuasSegitiga.text = luas.toString()


        }

        binding.Share

        return binding.root
    }


}
