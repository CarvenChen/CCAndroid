package com.example.ccphoto.entity;

import java.util.List;

public class NewsListResponse {

    /**
     * msg : success
     * code : 0
     * page : {"totalCount":8,"pageSize":10,"totalPage":1,"currPage":1,"list":[{"newsId":1,"newsTitle":"《忍者蛙》发售日公布 已上架Steam、支持简中","authorName":"3DMGAME","headerUrl":"https://p9.pstatp.com/thumb/6eed00026c4eac713a44","commentCount":3,"releaseDate":"2020-07-31 22:23:00","type":1,"thumbEntities":[{"thumbId":1,"thumbUrl":"http://p1-tt.byteimg.com/large/pgc-image/S6KR5958Y5X2Qt?from=pc","newsId":1}],"imgList":null},{"newsId":2,"newsTitle":"外媒爆料：育碧\u201c阿瓦隆\u201d项目胎死腹中，只因为他不喜欢奇幻游戏","authorName":"爱游戏的萌博士","headerUrl":"https://p3.pstatp.com/thumb/43310001daafa9723ddf","commentCount":1,"releaseDate":"2020-07-31 21:01:17","type":2,"thumbEntities":[{"thumbId":2,"thumbUrl":"http://p1-tt.byteimg.com/large/pgc-image/714415d37865444ca2bef51eb1706cda?from=pc","newsId":2},{"thumbId":3,"thumbUrl":"http://p1-tt.byteimg.com/large/pgc-image/33b9831739764bdb8a157efce048ec85?from=pc","newsId":2},{"thumbId":4,"thumbUrl":"http://p3-tt.byteimg.com/large/pgc-image/c8a4e737b54d41c1a84722fc1c6d191d?from=pc","newsId":2}],"imgList":null},{"newsId":3,"newsTitle":"索尼公布Ready for PlayStation 5电视阵容","authorName":"游戏时光VGtime","headerUrl":"https://p1.pstatp.com/thumb/dc0c0004c450216ab2f3","commentCount":6,"releaseDate":"2020-07-30 13:11:32","type":3,"thumbEntities":[{"thumbId":5,"thumbUrl":"http://p6-tt.byteimg.com/large/pgc-image/S6CLixgC4HSrXD?from=pc","newsId":3}],"imgList":null},{"newsId":4,"newsTitle":"一部不受关注的互动电影佳作\u2014\u2014解构《暴雨》","authorName":"瑾瑜游乐说","headerUrl":"https://sf3-ttcdn-tos.pstatp.com/img/pgc-image/e200b9de317b4e73af24299ea063bec2~120x256.image","commentCount":12,"releaseDate":"2020-07-30 13:11:32","type":3,"thumbEntities":[{"thumbId":6,"thumbUrl":"http://p6-tt.byteimg.com/large/pgc-image/17fe1be328e149c9aa400dcf8a8c4dd6?from=pc","newsId":4}],"imgList":null},{"newsId":5,"newsTitle":"《光环：无限》官方Q&A 无充值战利品，画质优化中","authorName":"聚玩社官方","headerUrl":"https://sf6-ttcdn-tos.pstatp.com/img/pgc-image/2bfe5f2e082e415cb92a03cfcfcfead8~120x256.image","commentCount":4,"releaseDate":"2020-08-01 08:22:47","type":2,"thumbEntities":[{"thumbId":7,"thumbUrl":"http://p1-tt.byteimg.com/large/pgc-image/a456c50fff344122b1b20ed99026c3f8?from=pc","newsId":5},{"thumbId":8,"thumbUrl":"http://p3-tt.byteimg.com/large/pgc-image/02973348d57d4dfba2d001f82caa3fcc?from=pc","newsId":5},{"thumbId":9,"thumbUrl":"http://p1-tt.byteimg.com/large/pgc-image/7add3e2a4f754d0baccc607cde132b5f?from=pc","newsId":5}],"imgList":null},{"newsId":6,"newsTitle":"2020小编个人力推的耐玩的养老游戏","authorName":"游戏我看看","headerUrl":"https://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/dc0d0001fca5e747f267~120x256.image","commentCount":7,"releaseDate":"2020-07-30 12:48:37","type":1,"thumbEntities":[{"thumbId":10,"thumbUrl":"http://p1-tt.byteimg.com/large/pgc-image/b957bfacdd134aa9a1a7e47d40d1be4b?from=pc","newsId":6}],"imgList":null},{"newsId":7,"newsTitle":"NBA复赛赛况：开拓者加时擒灰熊，太阳胜奇才，魔术\u201c主场\u201d破网","authorName":"头条专题","headerUrl":"https://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/ffbc0000ad1e717b76a6~120x256.image","commentCount":23,"releaseDate":"2020-08-01 06:49:44","type":1,"thumbEntities":[{"thumbId":11,"thumbUrl":"https://p3.pstatp.com/list/190x124/pgc-image/2b5f07505b67498e83e2faa32d637e5c","newsId":7}],"imgList":null},{"newsId":8,"newsTitle":"NBA最有含金量总冠军？奥拉朱旺95年4次以下克上！无冠军超过2次","authorName":"网罗篮球","headerUrl":"https://sf6-ttcdn-tos.pstatp.com/img/pgc-image/9f11654ff6184afd8941bcf7ccd3c5dd~120x256.image","commentCount":45,"releaseDate":"2020-05-23 14:08:09","type":2,"thumbEntities":[{"thumbId":12,"thumbUrl":"http://p6-tt.byteimg.com/large/pgc-image/36357b0bc5e54b0783c7ebe0bf9aefbd?from=pc","newsId":8},{"thumbId":13,"thumbUrl":"http://p1-tt.byteimg.com/large/pgc-image/d8c92b02eeb6490084c020c76c876c7a?from=pc","newsId":8},{"thumbId":14,"thumbUrl":"http://p3-tt.byteimg.com/large/pgc-image/7dfc0ccdd0ba4b4093fa5663891b5780?from=pc","newsId":8}],"imgList":null}]}
     */

    private String msg;
    private int code;
    private NewsPageModel page;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public NewsPageModel getPage() {
        return page;
    }

    public void setPage(NewsPageModel page) {
        this.page = page;
    }

    public static class NewsPageModel {
        /**
         * totalCount : 8
         * pageSize : 10
         * totalPage : 1
         * currPage : 1
         * list : [{"newsId":1,"newsTitle":"《忍者蛙》发售日公布 已上架Steam、支持简中","authorName":"3DMGAME","headerUrl":"https://p9.pstatp.com/thumb/6eed00026c4eac713a44","commentCount":3,"releaseDate":"2020-07-31 22:23:00","type":1,"thumbEntities":[{"thumbId":1,"thumbUrl":"http://p1-tt.byteimg.com/large/pgc-image/S6KR5958Y5X2Qt?from=pc","newsId":1}],"imgList":null},{"newsId":2,"newsTitle":"外媒爆料：育碧\u201c阿瓦隆\u201d项目胎死腹中，只因为他不喜欢奇幻游戏","authorName":"爱游戏的萌博士","headerUrl":"https://p3.pstatp.com/thumb/43310001daafa9723ddf","commentCount":1,"releaseDate":"2020-07-31 21:01:17","type":2,"thumbEntities":[{"thumbId":2,"thumbUrl":"http://p1-tt.byteimg.com/large/pgc-image/714415d37865444ca2bef51eb1706cda?from=pc","newsId":2},{"thumbId":3,"thumbUrl":"http://p1-tt.byteimg.com/large/pgc-image/33b9831739764bdb8a157efce048ec85?from=pc","newsId":2},{"thumbId":4,"thumbUrl":"http://p3-tt.byteimg.com/large/pgc-image/c8a4e737b54d41c1a84722fc1c6d191d?from=pc","newsId":2}],"imgList":null},{"newsId":3,"newsTitle":"索尼公布Ready for PlayStation 5电视阵容","authorName":"游戏时光VGtime","headerUrl":"https://p1.pstatp.com/thumb/dc0c0004c450216ab2f3","commentCount":6,"releaseDate":"2020-07-30 13:11:32","type":3,"thumbEntities":[{"thumbId":5,"thumbUrl":"http://p6-tt.byteimg.com/large/pgc-image/S6CLixgC4HSrXD?from=pc","newsId":3}],"imgList":null},{"newsId":4,"newsTitle":"一部不受关注的互动电影佳作\u2014\u2014解构《暴雨》","authorName":"瑾瑜游乐说","headerUrl":"https://sf3-ttcdn-tos.pstatp.com/img/pgc-image/e200b9de317b4e73af24299ea063bec2~120x256.image","commentCount":12,"releaseDate":"2020-07-30 13:11:32","type":3,"thumbEntities":[{"thumbId":6,"thumbUrl":"http://p6-tt.byteimg.com/large/pgc-image/17fe1be328e149c9aa400dcf8a8c4dd6?from=pc","newsId":4}],"imgList":null},{"newsId":5,"newsTitle":"《光环：无限》官方Q&A 无充值战利品，画质优化中","authorName":"聚玩社官方","headerUrl":"https://sf6-ttcdn-tos.pstatp.com/img/pgc-image/2bfe5f2e082e415cb92a03cfcfcfead8~120x256.image","commentCount":4,"releaseDate":"2020-08-01 08:22:47","type":2,"thumbEntities":[{"thumbId":7,"thumbUrl":"http://p1-tt.byteimg.com/large/pgc-image/a456c50fff344122b1b20ed99026c3f8?from=pc","newsId":5},{"thumbId":8,"thumbUrl":"http://p3-tt.byteimg.com/large/pgc-image/02973348d57d4dfba2d001f82caa3fcc?from=pc","newsId":5},{"thumbId":9,"thumbUrl":"http://p1-tt.byteimg.com/large/pgc-image/7add3e2a4f754d0baccc607cde132b5f?from=pc","newsId":5}],"imgList":null},{"newsId":6,"newsTitle":"2020小编个人力推的耐玩的养老游戏","authorName":"游戏我看看","headerUrl":"https://sf3-ttcdn-tos.pstatp.com/img/mosaic-legacy/dc0d0001fca5e747f267~120x256.image","commentCount":7,"releaseDate":"2020-07-30 12:48:37","type":1,"thumbEntities":[{"thumbId":10,"thumbUrl":"http://p1-tt.byteimg.com/large/pgc-image/b957bfacdd134aa9a1a7e47d40d1be4b?from=pc","newsId":6}],"imgList":null},{"newsId":7,"newsTitle":"NBA复赛赛况：开拓者加时擒灰熊，太阳胜奇才，魔术\u201c主场\u201d破网","authorName":"头条专题","headerUrl":"https://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/ffbc0000ad1e717b76a6~120x256.image","commentCount":23,"releaseDate":"2020-08-01 06:49:44","type":1,"thumbEntities":[{"thumbId":11,"thumbUrl":"https://p3.pstatp.com/list/190x124/pgc-image/2b5f07505b67498e83e2faa32d637e5c","newsId":7}],"imgList":null},{"newsId":8,"newsTitle":"NBA最有含金量总冠军？奥拉朱旺95年4次以下克上！无冠军超过2次","authorName":"网罗篮球","headerUrl":"https://sf6-ttcdn-tos.pstatp.com/img/pgc-image/9f11654ff6184afd8941bcf7ccd3c5dd~120x256.image","commentCount":45,"releaseDate":"2020-05-23 14:08:09","type":2,"thumbEntities":[{"thumbId":12,"thumbUrl":"http://p6-tt.byteimg.com/large/pgc-image/36357b0bc5e54b0783c7ebe0bf9aefbd?from=pc","newsId":8},{"thumbId":13,"thumbUrl":"http://p1-tt.byteimg.com/large/pgc-image/d8c92b02eeb6490084c020c76c876c7a?from=pc","newsId":8},{"thumbId":14,"thumbUrl":"http://p3-tt.byteimg.com/large/pgc-image/7dfc0ccdd0ba4b4093fa5663891b5780?from=pc","newsId":8}],"imgList":null}]
         */

        private int totalCount;
        private int pageSize;
        private int totalPage;
        private int currPage;
        private List<NewsEntity> list;

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getCurrPage() {
            return currPage;
        }

        public void setCurrPage(int currPage) {
            this.currPage = currPage;
        }

        public List<NewsEntity> getList() {
            return list;
        }

        public void setList(List<NewsEntity> list) {
            this.list = list;
        }
    }
}
