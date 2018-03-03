function sendAjax(url, callback) {

    var xmlhttp;
    xmlhttp = new XMLHttpRequest();

    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            callback(xmlhttp.responseText);
        }
    }

    xmlhttp.open("GET", url);
    xmlhttp.send();
}

sendAjax("http://localhost:8888/web/users/", function (msgFromServer) {
    alert(msgFromServer)})