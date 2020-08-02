import Chart from 'chart.js'
import { Doughnut } from 'vue-chartjs'
    
Chart.defaults.global.defaultFontSize = 18;
Chart.defaults.doughnut.cutoutPercentage = 80;

    export default {
      name: 'doughnut',
      extends: Doughnut,
      props: ['data', 'options'],
      mounted () {
        this.renderChart(this.data, this.options)
      }
    }