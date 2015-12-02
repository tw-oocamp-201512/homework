require File.dirname(__FILE__) + '/../spec_helper'

describe Taximeter do
  describe '#calculate_price' do
    let(:stop_mins) { 0 }

    subject { Taximeter.new(distance, stop_mins).calculate_charge }

    context 'when distance is in flag distance' do
      let(:distance) { 1.5 }

      it { is_expected.to eq 6 }
    end

    context 'when distance exceed flag distance but don not need to pay extra charge' do
      let(:distance) { 4 }

      it { is_expected.to eq 8 }
    end

    context 'when distance require extra charge' do
      let(:distance) { 11 }

      it { is_expected.to eq 18 }
    end

    context 'when exist stop waiting mins' do
      let(:distance)  { 11 }
      let(:stop_mins) { 2 }

      it { is_expected.to eq 18 }
    end
  end
end
