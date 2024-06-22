document.addEventListener('DOMContentLoaded', function() {
    const screen = document.querySelector('.screen');
    const buttons = document.querySelectorAll('button');
    let screenValue = '';

    buttons.forEach(button => {
        button.addEventListener('click', function(e) {
            const buttonText = e.target.innerText;
            
            if (buttonText === 'ON') {
                screenValue = '';
                screen.innerText = screenValue;
            } else if (buttonText === 'OFF') {
                screenValue = '';
                screen.innerText = screenValue;
            } else if (buttonText === 'AC') {
                screenValue = '';
                screen.innerText = screenValue;
            } else if (buttonText === 'DEL') {
                screenValue = screenValue.slice(0, -1);
                screen.innerText = screenValue;
            } else if (buttonText === '=') {
                try {
                    screenValue = eval(screenValue.replace('x', '*').replace('÷', '/'));
                    screen.innerText = screenValue;
                } catch (e) {
                    screen.innerText = 'Error';
                }
            } else {
                screenValue += buttonText;
                screen.innerText = screenValue;
            }
        });
    });
});
