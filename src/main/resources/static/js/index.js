document.addEventListener('alpine:init', () => {
    Alpine.data('scroll', () => ({
        open: false,
        hasScrolled: false,
        reactOnScroll() {
            console.log('tototobidule')
            if (this.$el.getBoundingClientRect().top < 120 && window.scrollY > 120) {
                this.hasScrolled = true;
            } else {
                this.hasScrolled = false;
            }
        }
    }))
})
