package com.jrodiz.snacklib.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.jrodiz.snacklib.di.SnackLibPresentationComponent
import com.jrodiz.snacklib.di.SnackLibPresentationComponentProvider
import com.jrodiz.snacklib.presentation.databinding.FragmentDashboardBinding
import javax.inject.Inject

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    lateinit var snackLibPresentationComponent: SnackLibPresentationComponent

    @Inject
    lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        snackLibPresentationComponent = (requireContext().applicationContext as SnackLibPresentationComponentProvider)
            .getSnackLibPresentationComponent()
        snackLibPresentationComponent.inject(this)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = "$it = ${dashboardViewModel.greeting}"
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
