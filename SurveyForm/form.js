document.addEventListener('DOMContentLoaded', function () {
    const surveyForm = document.getElementById('surveyForm');
    const submitBtn = document.getElementById('submitBtn');
    const resetBtn = document.getElementById('resetBtn');
    const popup = document.getElementById('popup');
    const popupContent = document.getElementById('popup-content');
    const closePopup = document.getElementById('close-popup');
    const submittedData = document.getElementById('submitted-data');

    submitBtn.addEventListener('click', function () {
        if (surveyForm.checkValidity()) {
            const formData = new FormData(surveyForm);
            let formValues = '<ul>';
            formData.forEach(function (value, key) {
                formValues += `<li><b>${key}:</b> ${value}</li>`;
            });
            formValues += '</ul>';
            submittedData.innerHTML = formValues;
            popup.style.display = 'block';
        } else {
            alert('Please fill in all required fields.');
        }
    });

    resetBtn.addEventListener('click', function () {
        surveyForm.reset();
    });

    closePopup.addEventListener('click', function () {
        popup.style.display = 'none';
        surveyForm.reset();
    });

    window.addEventListener('click', function (e) {
        if (e.target === popup) {
            popup.style.display = 'none';
            surveyForm.reset();
        }
    });
});
