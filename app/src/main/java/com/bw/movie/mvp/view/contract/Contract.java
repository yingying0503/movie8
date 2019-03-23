package com.bw.movie.mvp.view.contract;

import com.bw.movie.mvp.view.activity.MovieListActivity;

import java.util.HashMap;

import retrofit2.http.HeaderMap;
import retrofit2.http.Query;

public class Contract {

    /**
     * 登录的接口
     */
    public interface ILoginView {

        void onILoginSuccess(Object o);

        void onILoginFail(String errorInfo);

    }

    public interface ILoginPre {

        void onILoginPre(String url, HashMap<String, String> hashMap);

    }

    public interface ILoginModel {
        void ILogin(String url, HashMap<String, String> hashMap, LoginCallBack loginCallBack);
    }

    public interface LoginCallBack {
        void onSuccess(Object o);

        void onFail(String errorInfo);
    }


    //首页电影模块需要的接口
    public interface ICinemaView {

        void onICinemaSuccess(Object o);

        void onIReleaseMovieSuccess(Object o);

        void onIComingSoonMovieSuccess(Object o);

        void onICinemaFail(String errorInfo);

    }

    public interface ICinemaPre {

        void onICinemaPre(int page, int count);

        void onIReleaseMovie(int page, int count);

        void onIComingSoonMovie(int page, int count);

    }

    public interface ICinemaModel {
        void ICinema(int page, int count, CinemaCallBack cinemaCallBack);

        void IReleaseMovie(int page, int count, CinemaCallBack cinemaCallBack);

        void IComingSoonMovie(int page, int count, CinemaCallBack cinemaCallBack);
    }

    public interface CinemaCallBack {
        void onSuccess(Object o);

        void onFail(String errorInfo);
    }

    //首页影院模块需要的接口
    public interface IFilmView {

        void onIFilmSuccess(Object o);

        void onIFilmFail(String errorInfo);

    }

    public interface IFilmPre {

        void onIFilmPre();

    }

    public interface IFilmModel {
        void onIFilm();
    }

    public interface FilmCallBack {
        void onSuccess(Object o);

        void onFail(String errorInfo);
    }

    //首页我的模块需要的接口
    public interface IMyView {

        void onIMySuccess(Object o);

        void onIMyFail(String errorInfo);

    }

    public interface IMyPre {

        void onIMyPre(String url);

    }

    public interface IMyModel {
        void IMy(String url);
    }

    public interface MyCallBack {
        void onSuccess(Object o);

        void onFail(String errorInfo);
    }

    //详情activity
    public interface IMovieDetailView {

        void onIMovieDetailSuccess(Object o);

        void onIMovieDetailFail(String errorInfo);


    }

    public interface IMovieDetailPre {
        //详情
        void onIMovieDetailPre(int movieID);
        //评论
        void onIMovieCommenPre(int movieId, int page, int count);
          //点赞
        void onIFollowMovie(int movieId, HashMap<String, String> hashMap);
        //取消点赞
        void onICancelFollowMovie(int movieId, HashMap<String, String> hashMap);
        //电影评论点赞
        void onIMovieCommentGreatePre(HashMap<String, String> hashMap,int commentId);

    }

    public interface IMovieDetailModel {
        //电影详情
        void onIMovieDetailModel(int movieID, MovieDetailBack movieDetailBack);
        //电影的评论
        void onIMovieCommenModel(int movieId, int page, int count, MovieDetailBack movieDetailBack);
        //电影的点赞
        void onIFollowMovie(int movieId, HashMap<String, String> hashMap, MovieDetailBack movieDetailBack);
          //电影取消点赞
        void onICancelFollowMovie(int movieId, HashMap<String, String> hashMap, MovieDetailBack movieDetailBack);
        //电影评论点赞
        void onIMovieCommentGreateModel(HashMap<String, String> hashMap,int commentId,MovieDetailBack movieDetailBack);
    }

    public interface MovieDetailBack {
        void onSuccess(Object o);

        void onFail(String errorInfo);

    }

    //推荐影院fragment
    public interface IRecommendView {

        void onIRecommendSuccess(Object o);

        void onIRecommendFail(String errorInfo);

    }

    public interface IRecommendPre {

        void onIRecommendPre(int page, int count);

    }

    public interface IRecommendModel {
        void onIRecommendModel(int page, int count, RecommendBack recommendBack);
    }

    public interface RecommendBack {
        void onSuccess(Object o);

        void onFail(String errorInfo);
    }

    //附近影院fragment
    public interface INearView {

        void onINearSuccess(Object o);

        void onINearFail(String errorInfo);

    }

    public interface INearPre {

        void onINearPre(int page, int count);

    }

    public interface INearModel {
        void onINearModel(int page, int count, NearBack nearBack);
    }

    public interface NearBack {
        void onSuccess(Object o);

        void onFail(String errorInfo);
    }

    //影院详情activity
    public interface ICinemaListView {

        void onICinemaListSuccess(Object o);

        void onICinemaListFail(String errorInfo);

    }

    public interface ICinemaListPre {

        void onICinemaListPre(int movieID);

    }

    public interface ICinemaListModel {
        void onICinemaListModel(int movieID, CinemaListBack cinemaListBack);
    }

    public interface CinemaListBack {
        void onSuccess(Object o);

        void onFail(String errorInfo);
    }

    //电影详情当期
    public interface IScheduleListView {

        void onIScheduleListSuccess(Object o);

        void onIScheduleListCinemaSuccess(Object o);

        void onIScheduleListMovieSuccess(Object o);

        void onIScheduleListFail(String errorInfo);

    }

    public interface IScheduleListPre {

        void onIScheduleListPre(int cinemasId, int movieID);

        void onIScheduleListCinemaPre(int cinemasId);

        void onIScheduleListMoviePre(int movieID);

    }

    public interface IScheduleListModel {
        void onIScheduleListModel(int cinemasId, int movieID, ScheduleListBack scheduleListBack);

        void onIScheduleListCinemaModel(int cinemasId, ScheduleListBack scheduleListBack);

        void onIScheduleListMovieModel(int movieID, ScheduleListBack scheduleListBack);
    }

    public interface ScheduleListBack {
        void onSuccess(Object o);

        void onFail(String errorInfo);
    }

    /**
     * 根据用户id查询用户信息
     */
    public interface IMyMessageView {

        void onIMySuccess(Object o);
        void onIUpdatePass(Object o);

        void onIMyFail(String errorInfo);

    }

    public interface IMyMessagePre {

        void onIMyPre(HashMap<String, String> hashMap);
        void onIUpdatePassPre(HashMap<String, String > hashMap,HashMap<String, String > map);

    }

    public interface IMyMessageModel {
        void IMy(HashMap<String, String> hashMap, MyMessageCallBack myMessageCallBack);
        void onIUpdatePass(HashMap<String, String > hashMap,HashMap<String, String > map,MyMessageCallBack myMessageCallBack);
    }

    public interface MyMessageCallBack {
        void onSuccess(Object o);

        void onFail(String errorInfo);
    }

    /**
     * 我的关注电影
     */
    public interface IAttentionView {

        void onIAttentionSuccess(Object o);

        void onIMyFail(String errorInfo);

    }

    public interface IAttentionPre {

        void onIAttentionMoviePre(HashMap<String, String> hashMap, int page, int count);

        void onIAttentionCameraPres(HashMap<String, String> hashMap, int page, int count);

    }

    public interface IAttentionModel {
        void IAttentionMovie(HashMap<String, String> hashMap, int page, int count, MyAttentionCallBack myAttentionCallBack);

        void IIAttentionCameras(HashMap<String, String> hashMap, int page, int count, MyAttentionCallBack myAttentionCallBack);
    }

    public interface MyAttentionCallBack {
        void onSuccess(Object o);

        void onFail(String errorInfo);
    }

    //根据影院ID查询该影院当前排期的电影列表    //查询影院的详情
    public interface IMovieListView {

        void onIMovieListSuccess(Object o);
        void onIFindCimeraInfoSuccess(Object o);

        void onIMovieListCinemaSuccess(Object o);

        void onIMovieListCinemaMovieSuccess(Object o);

        void onIMovieListFail(String errorInfo);
        void onICimemaCommentSuccess(Object o);
        void onICimemaCommentGreateSuccess(Object o);


    }

    public interface IMovieListPre {
        void onIFindCimeraInfoPre(HashMap<String, String> hashMap, int cinemaId);

        void onIMovieListPre(int cinemasId);

        void onIMovieListCinemaPre(int cinemasId);

        void onIMovieListCinemaMoviePre(int cinemasId, int movieId);
        //影院评价
        void onICimemaCommentPre(@HeaderMap HashMap<String ,String> hashMap, @Query("cinemaId")int cinemaId, @Query("page")int page, @Query("count")int count);
       //影院评论点赞
       void onICimemaCommentGreatePre(@HeaderMap HashMap<String ,String> hashMap, @Query("cinemaId")int cinemaId);

    }

    public interface IMovieListModel {
        //影院的详情
        void IMyFeedBack(HashMap<String, String> hashMap, int cinemaId ,MyFeedBackCallBack myFeedBackCallBack);
        //影院评价列表
        void onICimemaCommentModel(@HeaderMap HashMap<String ,String> hashMap, @Query("cinemaId")int cinemaId, @Query("page")int page, @Query("count")int count,MovieListBack movieListBack);
        void onICimemaCommentGreateModel(@HeaderMap HashMap<String ,String> hashMap, @Query("cinemaId")int cinemaId,MovieListBack movieListBack);
        void onIMovieListModel(int cinemaId, MovieListBack movieListBack);

        void onIMovieListCinemaModel(int cinemaId, MovieListBack movieListBack);

        void onIMovieListCinemaMovieModel(int cinemasId, int movieId, MovieListBack movieListBack);
    }

    public interface MovieListBack {

        void onSuccess(Object o);

        void onFail(String errorInfo);
    }

    //用户购票记录查询列表
    public interface IMyRecotdView {

        void onIMyRecotdSuccess(Object o);

        void onIMyRecotdFail(String errorInfo);

    }

    public interface IMyRecotdPre {

        void onIMyRecotdPre(HashMap<String, String> hashMap, int page, int count,String status);

    }

    public interface IMyRecotdModel {
        void IMyRecotd(HashMap<String, String> hashMap, int page, int count, String status,MyRecotdCallBack myRecotdCallBack);

    }

    public interface MyRecotdCallBack {
        void onSuccess(Object o);

        void onFail(String errorInfo);
    }
    //用户反馈
    public interface IMyFeedBackView {

        void onIMyFeedBackSuccess(Object o);

        void onIMyFeedBackFail(String errorInfo);

    }

    public interface IMyFeedBackPre {

        void onIMyFeedBackPre(HashMap<String, String> hashMap, String comment);

    }

    public interface IMyFeedBackModel {
        void IMyFeedBack(HashMap<String, String> hashMap, String comment ,MyFeedBackCallBack myFeedBackCallBack);

    }

    public interface MyFeedBackCallBack {
        void onSuccess(Object o);

        void onFail(String errorInfo);
    }


}