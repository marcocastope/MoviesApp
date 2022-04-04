package com.marcocastope.moviesapp.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.marcocastope.moviesapp.databinding.FragmentDetailBinding
import com.marcocastope.moviesapp.di.URL_IMAGES
import com.marcocastope.moviesapp.presentation.viewmodels.DetailViewModel
import com.squareup.picasso.Picasso
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!
    private val detailViewModel: DetailViewModel by viewModel()
    private var movieId: Long? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val safeArg = DetailFragmentArgs.fromBundle(it)
            movieId = safeArg.movieId
        }
        initUi()
    }

    private fun initUi() {
        detailViewModel.getMovieById(movieId.toString())
        detailViewModel.movie.observe(requireActivity(), Observer {
            binding.movieDetailTitle.text = it.title
            binding.movieDetailReleaseDate.text = it.releaseDate
            binding.movieDetailVoteAverage.text = it.voteAverage.toString()
            binding.movieDetailOverview.text = it.overview
            Picasso.get().load(URL_IMAGES + it.posterPath).into(binding.movieDetailImage)
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}