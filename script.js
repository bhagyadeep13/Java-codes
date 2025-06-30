function showToast() {
  const toast = document.getElementById("toast");
  toast.classList.add("show");

  // Remove toast after 5 seconds
  setTimeout(() => {
    toast.classList.remove("show");
  }, 5000);
}

function hideToast() {
  const toast = document.getElementById("toast");
  toast.classList.remove("show");
}
