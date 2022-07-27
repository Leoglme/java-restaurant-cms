const colors = require("tailwindcss/colors");
module.exports = {
    darkMode: 'class',
    mode: 'jit',
    purge: {
        enabled: true,
        content: [
            "./**/*.html"
        ],
        options: {
            safelist: [],
        },
    },
    theme: {
        fontFamily: {
            'body': [
                'Inter',
                'ui-sans-serif',
                'system-ui',
                '-apple-system',
                'system-ui',
                'Segoe UI',
                'Roboto',
                'Helvetica Neue',
                'Arial',
                'Noto Sans',
                'sans-serif',
                'Apple Color Emoji',
                'Segoe UI Emoji',
                'Segoe UI Symbol',
                'Noto Color Emoji'
            ],
            'sans': [
                'Inter',
                'ui-sans-serif',
                'system-ui',
                '-apple-system',
                'system-ui',
                'Segoe UI',
                'Roboto',
                'Helvetica Neue',
                'Arial',
                'Noto Sans',
                'sans-serif',
                'Apple Color Emoji',
                'Segoe UI Emoji',
                'Segoe UI Symbol',
                'Noto Color Emoji'
            ]
        },
        colors: {
            ...colors,
            black: '#0E0C0F',
            'primary': '#E49031',
            'grey': {
                100: '#101623',
                200: '#101623',
                300: '#101623',
                400: '#101623',
                500: '#101623',
                600: '#101623',
                700: '#101623',
                800: '#101623',
                900: '#101623',
            },
        },
        extend: {
            spacing: {
                "1.5": "1.125rem"
            },
            minHeight: {
                "screen-75": "75vh",
            },
            fontSize: {
                "55": "55rem",
            },
            opacity: {
                "80": ".8",
            },
            zIndex: {
                "2": 2,
                "3": 3,
            },
            inset: {
                "-100": "-100%",
                "-225-px": "-225px",
                "-160-px": "-160px",
                "-150-px": "-150px",
                "-94-px": "-94px",
                "-50-px": "-50px",
                "-29-px": "-29px",
                "-20-px": "-20px",
                "25-px": "25px",
                "40-px": "40px",
                "95-px": "95px",
                "145-px": "145px",
                "195-px": "195px",
                "210-px": "210px",
                "260-px": "260px",
            },
            height: {
                "95-px": "95px",
                "70-px": "70px",
                "350-px": "350px",
                "500-px": "500px",
                "600-px": "600px",
            },
            maxHeight: {
                "860-px": "860px",
            },
            maxWidth: {
                "100-px": "100px",
                "120-px": "120px",
                "150-px": "150px",
                "180-px": "180px",
                "200-px": "200px",
                "210-px": "210px",
                "580-px": "580px",
            },
            minWidth: {
                "140-px": "140px",
                "48": "12rem",
            },
            backgroundSize: {
                full: "100%",
            },
        },
    },
    variants: [
        "responsive",
        "group-hover",
        "focus-within",
        "first",
        "last",
        "odd",
        "even",
        "hover",
        "focus",
        "active",
        "visited",
        "disabled",
    ]
};
