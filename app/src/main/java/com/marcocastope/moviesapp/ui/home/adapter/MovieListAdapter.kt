package com.marcocastope.moviesapp.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.marcocastope.moviesapp.databinding.ItemMovieMainBinding
import com.marcocastope.moviesapp.di.URL_IMAGES
import com.marcocastope.moviesapp.domain.entities.MovieEntity
import com.squareup.picasso.Picasso

class MovieListAdapter(
    lifecycleOwner: LifecycleOwner,
    private val movies: LiveData<List<MovieEntity>>, private val listener: (MovieEntity) -> Unit
) :
    RecyclerView.Adapter<MovieListAdapter.MovieViewHolder>() {

    init {
        movies.observe(lifecycleOwner) { notifyDataSetChanged() }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding =
            ItemMovieMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        movies.value?.get(position)?.let { movie ->
            holder.bind(movie)
            holder.itemView.setOnClickListener { listener(movie) }
        }
    }

    override fun getItemCount(): Int = movies.value?.size ?: 0

    inner class MovieViewHolder(val binding: ItemMovieMainBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(movie: MovieEntity) {
            binding.movieTitle.text = movie.title
            Picasso.get().load(URL_IMAGES + movie.posterPath).into(binding.movieImage)
        }
    }
}