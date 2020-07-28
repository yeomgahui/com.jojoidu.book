var main = {
    init: function () {
        var _this = this;

        $("#btn_save").on("click", function () {
            _this.save();
        });
        $('#btn-update').on("click",function () {
            _this.update();
        });
        $('#btn-delete').on('click',function () {
            _this.delete();
        });
    },

    save: function () {
        var data = {
            title: $('#title').val(),
            author : $('#author').val(),
            content : $('#content').val()
        };

        $.ajax({
            type : 'POST',
            url : '/api/v1/posts',
            dataType : 'json',
            contentType :'application/json; charset=utf-8',
            data : JSON.stringify(data)
        }).done(function () {
            alert('글이 등록 되었습니다.');
            window.location.href ='/';

        }).fail(function (request,status, error) {
            alert("code = "+ request.status + " message = " + request.responseText + " error = " + error);
        });

    },
    update : function(){
        var id = $('#id').val()
        var data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };

        $.ajax({
            type : 'PUT',
            url : '/api/v1/posts/'+id,
            dataType : 'json',
            contentType: 'application/json; charset=utf-8',
            data : JSON.stringify(data)
        }).done(function(){
            alert('글이 수정 되었습니다.');
            window.location.href = '/';
        }).fail(function (error) {
            alert(error);
        });
    },
    delete : function () {
        var id =$('#id').val();

        $.ajax({
            type:'DELETE',
            url : '/api/v1/posts/'+id,
            dataType : 'json',
            contentType : 'application/json; charset=utf-8'
        }).done(function () {
            alert("글이 삭제되었습니다.");
            window.location.href='/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }
};
main.init();