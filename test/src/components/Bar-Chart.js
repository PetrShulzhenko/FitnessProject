import Chart from 'chart.js'
import { Bar } from 'vue-chartjs'

Chart.defaults.global.defaultFontSize = 18;
Chart.defaults.global.defaultFontFamily = "'Open Sans', sans-serif";

    export default {
      name: 'barchart',
      extends: Bar,
      props: ['data', 'options'],
      mounted () {
        this.renderChart(this.data, this.options)
      }
    }