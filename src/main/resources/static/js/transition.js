window.addEventListener('load', function() {
    var transitionScreen = document.getElementById('transition-screen');
    transitionScreen.classList.add('fade-out');

    transitionScreen.addEventListener('transitionend', function() {
        transitionScreen.parentNode.removeChild(transitionScreen);
    });
});