const inputElements = document.querySelectorAll('input');

inputElements.forEach(input => {
  input.addEventListener('input', () => {
    if (input.validity.valid) {
      input.classList.remove('invalid-input');
    } else {
      input.classList.add('invalid-input');
    }
  });
});