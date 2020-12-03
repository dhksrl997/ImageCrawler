$(function () {
    $(".send").click(function () {
        var value = $(".input").val();
        $.ajax({
            type: 'post',
            url: '/gather',
            dataType: 'json',
            data: {
                url: value
            },
            success: [
                function (data) {
                    console.log(data);
                    for (let i = 0; i < data.length; i++) {
                        $(".get-img").append(`<img src="${data[i]}"><br><a href="${data[i]}" download>download img</a><br><br>`);
                    }
                }

            ]
        });
    });
});

