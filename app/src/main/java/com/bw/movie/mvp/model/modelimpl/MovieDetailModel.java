package com.bw.movie.mvp.model.modelimpl;

import android.util.Log;

import com.bw.movie.mvp.model.api.Api;
import com.bw.movie.mvp.model.api.ApiService;
import com.bw.movie.mvp.model.bean.CancelFollowMovieBean;
import com.bw.movie.mvp.model.bean.FollowMovieBean;
import com.bw.movie.mvp.model.bean.MovieCommentBean;
import com.bw.movie.mvp.model.bean.MoviesDetailBean;
import com.bw.movie.mvp.model.utils.RetrofitUtils;
import com.bw.movie.mvp.view.contract.Contract;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MovieDetailModel implements Contract.IMovieDetailModel {

    @Override
    public void onIMovieDetailModel(int movieID, final Contract.MovieDetailBack movieDetailBack) {
        ApiService apiService = RetrofitUtils.getInstance().create(ApiService.class);
        apiService.getMoviesDetail(movieID)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<MoviesDetailBean>() {
                    @Override
                    public void accept(MoviesDetailBean moviesDetailBean) throws Exception {
                        movieDetailBack.onSuccess(moviesDetailBean);
                    }
                });
    }


    public void onIMovieCommenModel(int movieId,int page, int count, final Contract.MovieDetailBack movieDetailBack) {
        ApiService apiService = RetrofitUtils.getInstance().create(ApiService.class);
        apiService.movieComment(movieId,page,count)
               .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<MovieCommentBean>() {
                    @Override
                    public void accept(MovieCommentBean movieCommentBean) throws Exception {
                        Log.e("movieCommentBean",movieCommentBean.toString());
                        movieDetailBack.onSuccess(movieCommentBean);
                    }
                });
    }

    @Override
    public void onIFollowMovie(int movieId, HashMap<String, String> hashMap, final Contract.MovieDetailBack movieDetailBack) {
        ApiService apiService = RetrofitUtils.getInstance().create(ApiService.class);
        apiService.followMovie(movieId,hashMap)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<FollowMovieBean>() {
                    @Override
                    public void accept(FollowMovieBean followMovieBean) throws Exception {
                        Log.e("movieCommentBean",followMovieBean.toString());
                        movieDetailBack.onSuccess(followMovieBean);
                    }
                });

    }

    @Override
    public void onICancelFollowMovie(int movieId, HashMap<String, String> hashMap, final Contract.MovieDetailBack movieDetailBack) {
        ApiService apiService = RetrofitUtils.getInstance().create(ApiService.class);
        apiService.cancelFollowMovie(movieId,hashMap)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<CancelFollowMovieBean>() {
                    @Override
                    public void accept(CancelFollowMovieBean cancelFollowMovieBean) throws Exception {
                        Log.e("movieCommentBean",cancelFollowMovieBean.toString());
                        movieDetailBack.onSuccess(cancelFollowMovieBean);
                    }
                });
    }
}
